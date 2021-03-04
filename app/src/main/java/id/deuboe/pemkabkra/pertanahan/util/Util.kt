package id.deuboe.pemkabkra.pertanahan.util

import id.deuboe.pemkabkra.pertanahan.model.Choose
import id.deuboe.pemkabkra.pertanahan.model.Item
import id.deuboe.pemkabkra.pertanahan.model.Persyaratan

object Util {
    const val HOME_FRAGMENT = "HomeFragment"
    val listChoose = listOf(
        Choose(
            0,
            "Pemecahan Bidang",
            "Suatu bidang tanah yang sudah bersertipikat dapat dipecah menjadi beberapa bagian yang masing-masing merupakan satuan bidang baru dengan status hukum yang sama dengan bidang tanah semula. Dalam pendaftaran pemecahan bidang, Surat Ukur, Buku Tanah dan Sertipikat Hak Atas Tanah semula dinyatakan tidak berlaku lagi."
        ),
        Choose(
            1,
            "Penggabungan Bidang",
            "Dua bidang tanah atau lebih yang sudah bersertipikat yang letaknya berbatasan dan kesemuanya atas nama pemilik yang sama dapat digabung menjadi satu satuan bidang baru, jika semuanya dipunyai dengan jenis hak yang sama."
        ),
        Choose(
            2,
            "Pemisahan Bidang",
            "Suatu bidang tanah yang sudah bersertipikat dapat dipisahkan sebagian atau beberapa bagian yang selanjutnya merupakan satuan bidang baru dengan status hukum yang sama dengan bidang tanah semula. Dalam pendaftaran pemisahan bidang, Surat Ukur, Buku Tanah dan Sertipikat yang lama tetap berlaku untuk bidang tanah semula setelah dikurangi bidang tanah yang dipisahkan."
        ),
        Choose(
            3,
            "Jual Beli",
            "Jual beli merupakan peralihan hak sebagai akibat telah dibuatnya suatu perjanjian dengan mana pihak yang satu mengikatkan dirinya untuk menyerahkan sebidang tanah dan pihak lainnya untuk membayar harga yang telah dijanjikan."
        ),
        Choose(
            4,
            "Hibah",
            "Hibah merupakan peralihan hak sebagai akibat adanya suatu perjanjian dengan mana si penghibah di waktu hidupnya dengan cuma-cuma dan dengan tidak dapat ditarik kembali menyerahkan sebidang tanah guna keperluan si penerima hibah yang menerima penyerahan itu."
        ),
        Choose(
            5,
            "Pewarisan",
            "Pewarisan merupakan peralihan hak yang terjadi sebagai akibat suatu peristiwa hukum, yaitu matinya seorang pewaris atau dengan kata lain adalah peralihan hak yang terjadi karena pemberinya meninggal dunia."
        ),
        Choose(
            6,
            "Tukar Menukar",
            "Tukar menukar merupakan peralihan hak yang terjadi karena adanya suatu perjanjian dengan mana kedua belah pihak mengikatkan dirinya untuk saling memberikan suatu barang secara bertimbal balik sebagai gantinya suatu barang yang lain."
        ),
        Choose(
            7,
            "Pemasukan Dalam Perusahaan",
            "Pemasukan dalam perusahaan (inbreng) yaitu peralihan hak yang terjadi sebagai akibat adanya perjanjian dengan mana pihak yang satu memasukkan tanahnya sebagai penyertaan ke dalam suatu Perseroan Terbatas sebagai pihak kedua, selanjutnya pihak kedua mengganti nilai tanah tersebut dengan saham perusahaan dimaksud."
        ),
        Choose(
            8,
            "Pembagian Hak Bersama",
            "Pembagian hak bersama merupakan peralihan hak yang terjadi sebagai akibat timbulnya perjanjian diantara para pihak untuk mengakhiri suatu pemilikan bersama."
        ),
        Choose(
            9,
            "Lelang",
            "Lelang yaitu penjualan barang yang terbuka untuk umum dengan penawaran harga secara tertulis dan/atau lisan yang semakin meningkat atau menurun untuk mencapai harga tertinggi yang didahului dengan pengumuman lelang."
        ),
        Choose(
            10,
            "Konversi, Pengakuan dan Penegasan",
            "Konversi, pengakuan dan penegasan yaitu permohonan pembuatan sertipikat hak atas tanah yang berasal dari tanah milik adat yang diajukan oleh pemegang hak tanah milik adat ke kantor pertanahan, pada dasarnya diproses melalui kegiatan pengukuran bidang tanah, penelitian alat bukti oleh panitia pemeriksaan tanah (Panitia A), kemudian diumumkan selama 60 (enam puluh) hari, jika dalam waktu pengumuman tidak ada yang mengajukan keberatan, maka diterbitkan sertipikat melalui pencatatan konversi, penegasan dan pengakuan hak."
        ),
        Choose(
            11,
            "Konversi, Pengakuan dan Penegasan Wakaf",
            "Konversi, pengakuan dan penegasan wakaf yaitu permohonan pembuatan sertipikat wakaf yang berasal dari tanah milik adat yang diajukan oleh nazir atau orang yang ditunjuk mendaftarkan tanah wakaf ke kantor pertanahan, pada dasarnya diproses melalui kegiatan pengukuran bidang tanah, penelitian alat bukti oleh panitia pemeriksaan tanah (Panitia A), kemudian diumumkan selama 60 (enam puluh) hari, jika dalam waktu pengumuman tidak ada yang mengajukan keberatan, maka diterbitkan sertipikat wakaf."
        ),
        Choose(
            12,
            "Blokir",
            "Blokir."
        ),
        Choose(
            13,
            "Pengecekan",
            "Pengecekan."
        ),
        Choose(
            14,
            "Sita",
            "Sita."
        ),
        Choose(
            15,
            "Pengangkatan Sita",
            "Pengangkatan sita."
        ),
        Choose(
            16,
            "Surat Keterangan Pendaftaran Tanah",
            "Surat keterangan pendaftaran tanah."
        ),
        Choose(
            17,
            "Pendaftaran Hak Tanggungan",
            "Pendaftaran hak tanggungan."
        ),
        Choose(
            18,
            "Roya",
            "Roya."
        ),
        Choose(
            19,
            "Peralihan Hak Tanggungan",
            "Peralihan hak tanggungan."
        ),
        Choose(
            20,
            "Perubahan Kreditur",
            "Perubahan kreditur."
        ),
        Choose(
            21,
            "Pengganti Sertipikat Hilang",
            "Permohonan penggantian sertipikat karena hilang harus disertai pernyataan di bawah sumpah dari pemilik tanah di hadapan Kepala Kantor Pertanahan letak tanah yang bersangkutan mengenai hilangnya sertipikat tersebut yang dituangkan dalam surat pernyataan. Penerbitan Sertipikat Pengganti didahului dengan pengumuman 1 (satu) kali dalam salah satu surat kabar harian setempat atas biaya pemohon jika dalam jangka waktu 30 (tiga puluh) hari dihitung sejak hari pengumuman tidak ada yang mengajukan keberatan mengenai akan diterbitkannya sertipikat pengganti tersebut maka diterbitkan sertipikat baru. Untuk penerbitan Sertipikat pengganti tidak dilakukan pengukuran maupun pemeriksaan tanah dan nomor hak tidak diubah."
        ),
        Choose(
            22,
            "Pengganti Sertipikat Lama",
            "Permohonan penerbitan sertipikat pengganti karena masih menggunakan blanko sertipikat lama dapat diajukan oleh yang berkepentingan dengan melampirkan sertipikat yang bersangkutan. Dalam hal penggantian sertipikat karena masih menggunakan blanko lama, Sertipikat yang lama ditahan dan dimusnahkan."
        ),
        Choose(
            23,
            "Pengganti Sertipikat Rusak",
            "Permohonan penerbitan sertipikat pengganti karena rusak dapat diajukan oleh yang berkepentingan dengan melampirkan sertipikat atau sisa sertipikat yang bersangkutan. Sertipikat dianggap rusak apabila ada bagian yang tidak terbaca atau ada halaman yang sobek atau terlepas, akan tetapi masih tersisa bagian sertipikat yang cukup untuk mengidentifikasi adanya sertipikat tersebut. Dalam hal penggantian sertipikat karena rusak, Sertipikat atau sisa sertipikat yang lama ditahan dan dimusnahkan."
        ),
        Choose(
            24,
            "Pendaftaran HMSRS",
            "Pendaftaran hak milik satuan rumah susun."
        ),
        Choose(
            25,
            "Perpanjangan HMSRS",
            "Perpanjangan hak milik satuan rumah susun."
        ),
        Choose(
            26,
            "Perubahan Hak Wakaf",
            "Perubahan hak wakaf."
        ),
        Choose(
            27,
            "Perubahan Hak Rumah Tinggal",
            "Perubahan hak rumah tinggal."
        ),
        Choose(
            28,
            "Pengembalian Batas",
            "Pengembalian batas."
        ),
        Choose(
            29,
            "Mengetahui Luas",
            "Mengetahui luas."
        ),
        Choose(
            30,
            "Pemberian Hak Milik Perorangan",
            "Pelayanan pemberian hak milik perorangan."
        ),
        Choose(
            31,
            "Pemberian Hak Milik Badan Hukum",
            "Pelayanan pemberian hak milik badan hukum."
        ),
        Choose(
            32,
            "Pemberian Hak Guna Usaha Perorangan",
            "Pelayanan pemberian hak guna usaha perorangan."
        ),
        Choose(
            33,
            "Pemberian Hak Guna Usaha Badan Hukum",
            "Pelayanan pemberian hak guna usaha badan hukum."
        ),
        Choose(
            34,
            "Pemberian Hak Guna Bangunan Perorangan",
            "Pelayanan pemberian hak bangunan perorangan."
        ),
        Choose(
            35,
            "Pemberian Hak Guna Bangunan Badan Hukum",
            "Pelayanan pemberian hak bangunan badan hukum."
        ),
        Choose(
            36,
            "Pemberian Hak Pakai Perorangan WNI",
            "Pelayanan pemberian hak pakai perorangan WNI."
        ),
        Choose(
            37,
            "Pemberian Hak Pakai Perorangan WNA",
            "Pelayanan pemberian hak pakai perorangan WNA."
        ),
        Choose(
            38,
            "Pemberian Hak Pakai Badan Hukum Indonesia",
            "Pelayanan pemberian hak pakai badan hukum Indonesia."
        ),
        Choose(
            39,
            "Pemberian Hak Pakai Badan Hukum Asing",
            "Pelayanan pemberian hak pakai badan hukum asing."
        ),
        Choose(
            40,
            "Pemberian Hak Pakai Instansi Pemerintah",
            "Pelayanan pemberian hak pakai instansi pemerintah."
        ),
        Choose(
            41,
            "Pemberian Hak Pakai Pemerintah Asing",
            "Pelayanan pemberian hak pakai pemerintah asing."
        ),
        Choose(
            42,
            "Pemberian Hak Pengelolaan Instansi Pemerintah, BUMN dan BUMD",
            "Pelayanan pemberian hak pengelolaan instansi pemerintah, BUMN dan BUMD."
        ),
        Choose(
            43,
            "Pemberian Hak Wakaf",
            "Pelayanan pemberian hak wakaf."
        ),
        Choose(
            44,
            "P3MB atau Prk5",
            "P3MB atau Prk5."
        ),
        Choose(
            45,
            "Perpanjangan Hak Guna Usaha",
            "Perpanjangan hak guna usaha."
        ),
        Choose(
            46,
            "Perpanjangan Hak Guna Bangunan Atau Hak Pakai",
            "Perpanjangan hak guna bangunan atau hak pakai."
        ),
        Choose(
            47,
            "Pembaruan Hak Guna Usaha Perorangan",
            "Pembaruan hak guna usaha perorangan."
        ),
        Choose(
            48,
            "Pembaruan Hak Guna Usaha Badan Hukum",
            "Pembaruan hak guna usaha badan hukum."
        ),
        Choose(
            49,
            "Pembaruan Hak Guna Bangunan Perorangan",
            "Pembaruan hak guna bangunan perorangan."
        ),
        Choose(
            50,
            "Pembaruan Hak Guna Bangunan Badan Hukum",
            "Pembaruan hak guna bangunan badan hukum."
        ),
        Choose(
            51,
            "Pembaruan Hak Pakai Perorangan WNI",
            "Pembaruan hak pakai perorangan WNI."
        ),
        Choose(
            52,
            "Pembaruan Hak Pakai Perorangan WNA",
            "Pembaruan hak pakai perorangan WNA."
        ),
        Choose(
            53,
            "Pembaruan Hak Pakai Badan Hukum Indonesia",
            "Pembaruan hak pakai perorangan badan hukum Indonesia."
        ),
        Choose(
            54,
            "Pembaruan Hak Pakai Badan Hukum Asing",
            "Pembaruan hak pakai badan hukum asing."
        ),
        Choose(
            55,
            "Pembaruan Hak Pakai Instansi Pemerintah",
            "Pembaruan hak pakai instansi pemerintah."
        ),
        Choose(
            56,
            "Pembaruan Hak Pakai Pemerintah Asing",
            "Pembaruan hak pakai pemerintah asing."
        ),
        Choose(
            57,
            "Pertimbangan Teknis Pertanahan Dalam Rangka Izin Lokasi",
            "Pertimbangan teknis dalam rangka izin lokasi."
        ),
        Choose(
            58,
            "Pertimbangan Teknis Pertanahan Dalam Rangka Izin Perubahan Penggunaan Tanah",
            "Pertimbangan teknis dalam rangka izin perubahan penggunaan tanah."
        )
    )

    val listDetailPersyaratan = listOf(
        Persyaratan(
            0,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya di atas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Rencana Tapak/Site Plan dari Pemerintah Kabupaten/Kota setempat."
                )
            )
        ),
        Persyaratan(
            1,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya di atas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan penegasan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                )
            )
        ),
        Persyaratan(
            2,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya di atas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Rencana Tapak/Site Plan dari Pemerintah Kabupaten/Kota setempat."
                )
            )
        ),
        Persyaratan(
            3,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Akta jual beli dari PPAT."
                ),
                Item(
                    "7.",
                    "Fotokopi KTP dan para pihak penjual-pembeli dan atau kuasanya."
                ),
                Item(
                    "8.",
                    "Ijin pemindahan hak apabila di dalam sertifikat/keputusannya dicantumkan tanda yang menyatakan bahwa hak tersebut hanya boleh dipindahtangankan jika telah diperoleh ijin dari instansi yang berwenang."
                ),
                Item(
                    "9.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                )
            )
        ),
        Persyaratan(
            4,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon/pemegang dan penerima hak (KTP, KK) serta kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Sertifikat Asli."
                ),
                Item(
                    "5.",
                    "Akta hibah dari PPAT."
                ),
                Item(
                    "6.",
                    "Ijin pemindahan hak apabila di dalam sertifikat / keputusannya dicantumkan tanda yang menyatakan bahwa hak tersebut hanya boleh dipindahtangankan jika telah diperoleh ijin dari instansi yang berwenang."
                ),
                Item(
                    "7.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                ),
                Item(
                    "8.",
                    "Penyerahan bukti SSB (BPHTB) dan bukti SSP/PPH untuk perolehan tanah lebih dari 60 Juta Rupiah."
                )
            )
        ),
        Persyaratan(
            5,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon/para ahli waris (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Sertifikat Asli."
                ),
                Item(
                    "5.",
                    "Surat Keterangan Waris sesuai peraturan perundang-undangan."
                ),
                Item(
                    "6.",
                    "Akte Wasiat Notariel."
                ),
                Item(
                    "7.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                ),
                Item(
                    "8.",
                    "Penyerahan bukti SSB (BPHTB), bukti SSP/PPH untuk perolehan tanah lebih dari 60 Juta Rupiah bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                )
            )
        ),
        Persyaratan(
            6,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Akta tukar menukar dari PPAT."
                ),
                Item(
                    "7.",
                    "Ijin pemindahan hak apabila di dalam sertifikat / keputusannya dicantumkan tanda yang menyatakan bahwa hak tersebut hanya boleh dipindahtangankan jika telah diperoleh ijin dari instansi yang berwenang."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                ),
                Item(
                    "9.",
                    "Penyerahan bukti SSB (BPHTB) dan bukti SSP/PPH untuk perolehan tanah lebih dari 60 Juta Rupiah."
                )
            )
        ),
        Persyaratan(
            7,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Akta pemasukan dalam perusahaan dari PPAT."
                ),
                Item(
                    "7.",
                    "Ijin pemindahan hak apabila di dalam sertifikat / keputusannya dicantumkan tanda yang menyatakan bahwa hak tersebut hanya boleh dipindahtangankan jika telah diperoleh ijin dari instansi yang berwenang."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                ),
                Item(
                    "9.",
                    "Penyerahan bukti SSB (BPHTB) dan bukti SSP/PPH untuk perolehan tanah lebih dari 60 Juta Rupiah."
                )
            )
        ),
        Persyaratan(
            8,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Akta Pembagian Hak Bersama dari PPAT."
                ),
                Item(
                    "7.",
                    "Ijin pemindahan hak apabila di dalam sertifikat/keputusannya dicantumkan tanda yang menyatakan bahwa hak tersebut hanya boleh dipindahtangankan jika telah diperoleh ijin dari instansi yang berwenang."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                ),
                Item(
                    "9.",
                    "Penyerahan bukti SSB (BPHTB) dan bukti SSP/PPH untuk perolehan tanah lebih dari 60 Juta Rupiah."
                )
            )
        ),
        Persyaratan(
            9,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon/pemegang dan penerima hak (KTP, KK) serta kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Risalah Lelang."
                ),
                Item(
                    "7.",
                    "Penyerahan Bukti Pelunasan Lelang."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                ),
                Item(
                    "9.",
                    "Putusan pengadilan yang telah memiliki kekuatan hukum yang tetap (Inkracht)."
                )
            )
        ),
        Persyaratan(
            10,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Bukti pemilikan tanah/alas hak milik adat/bekas milik adat."
                ),
                Item(
                    "5.",
                    "Fotokopi SPPT PBB Tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket dan penyerahan bukti SSB (BPHTB)."
                ),
                Item(
                    "6.",
                    "Melampirkan bukti SSP/PPh sesuai dengan ketentuan."
                )
            )
        ),
        Persyaratan(
            11,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Bukti pemilikan tanah/alas hak milik adat/bekas milik adat."
                ),
                Item(
                    "5.",
                    "Akta Ikrar Wakaf/Surat Ikrar Wakaf."
                ),
                Item(
                    "6.",
                    "Fotokopi SPPT PBB Tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket dan penyerahan bukti SSB (BPHTB)."
                ),
                Item(
                    "7.",
                    "Melampirkan bukti SSP/PPh sesuai dengan ketentuan."
                )
            )
        ),
        Persyaratan(
            12,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan, yang memuat pernyataan mengenai persetujuan bahwa pencatatan pemblokiran hapus apabila jangka waktunya berakhir."
                ),
                Item(
                    "2.",
                    "Fotokopi indentitas pemohon atau kuasanya, dan asli Surat Kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi Akta Pendirian Badan Hukum."
                ),
                Item(
                    "4.",
                    "Keterangan mengenai nama pemegang hak, jenis hak, nomor, luas dan letak tanah yang dimohonkan blokir."
                ),
                Item(
                    "5.",
                    "Bukti setor penerimaan negara bukan pajak mengenai pencatatan blokir."
                ),
                Item(
                    "6.",
                    "Bukti hubungan hukum antara pemohon dengan tanah."
                ),
                Item(
                    "7.",
                    "Syarat lainnya sesuai dengan ketentuan peraturan perundang-undangan."
                )
            )
        ),
        Persyaratan(
            13,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Sertipikat hak atas tanah/Sertipikat HMSRS."
                ),
                Item(
                    "5.",
                    "Surat pengantar dari PPAT untuk kegiatan peralihan/pembebanan hak dengan akta PPAT."
                )
            )
        ),
        Persyaratan(
            14,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Surat Permintaan dari Pengadilan, Kejaksaan, Kepolisian, Komisi Pemberantasan Korupsi, Kantor Pelayanan Pajak, atau Kantor Lelang."
                ),
                Item(
                    "6.",
                    "Berita Acara Penetapan Sita Jaminan dari Pengadilan."
                )
            )
        ),
        Persyaratan(
            15,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Salinan resmi Berita Acara Pengangkatan Sita dari lembaga peradilan."
                )
            )
        ),
        Persyaratan(
            16,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Bukti hubungan hukum antara subjek dan objek hak."
                )
            )
        ),
        Persyaratan(
            17,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Akta Pemberian Hak Tanggungan (APHT)."
                ),
                Item(
                    "7.",
                    "Salinan APHT yang sudah diparaf oleh PPAT yang bersangkutan untuk disahkan sebagai salinan oleh Kepala Kantor untuk pembuatan sertipikat Hak Tanggungan."
                ),
                Item(
                    "8.",
                    "Fotokopi KTP pemberi HT (debitur) atau Akta Pendirian Badan Hukum, penerima HT (Kreditur) dan/atau kuasanya yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "9.",
                    "Surat Kuasa Membebankan Hak Tanggungan (SKMHT) apabila Pemberian Hak Tanggungan melalui Kuasa."
                )
            )
        ),
        Persyaratan(
            18,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertipikat tanah dan Sertipikat Hak Tanggungan dan/atau konsen roya jika sertipikat Hak Tanggungan hilang."
                ),
                Item(
                    "6.",
                    "Surat Roya/Keterangan Lunas/Pelunasan Hutang dari Kreditur."
                ),
                Item(
                    "7.",
                    "Fotokopi KTP pemberi HT (debitur), penerima HT (Kreditur) dan/atau kuasanya yang telah dicocokkan dengan aslinya oleh petugas loket."
                )
            )
        ),
        Persyaratan(
            19,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Surat Pengantar dari PPAT."
                ),
                Item(
                    "6.",
                    "Sertipikat asli (Hak Tanggungan dan Hak Atas Tanah)."
                ),
                Item(
                    "7.",
                    "Surat tanda bukti peralihan (beralihnya piutang) berupa : Akta Cessie atau akta otentik yang menyatakan adanya cessie tersebut, atau Bukti pewarisan."
                )
            )
        ),
        Persyaratan(
            20,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Surat Pengantar dari PPAT."
                ),
                Item(
                    "6.",
                    "Sertipikat asli."
                ),
                Item(
                    "7.",
                    "APHT (Akta Pemberian Hak Tanggungan)."
                ),
                Item(
                    "8.",
                    "Surat tanda bukti peralihan (beralihnya piutang) berupa : Akta Subrogasi, atau akta otentik yang menyatakan adanya Subrogasi atau Bukti pewarisan."
                )
            )
        ),
        Persyaratan(
            21,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Fotokopi Sertipikat (jika ada)."
                ),
                Item(
                    "6.",
                    "Surat Pernyataan dibawah sumpah oleh pemegang hak/yang menghilangkan."
                ),
                Item(
                    "7.",
                    "Surat tanda lapor kehilangan dari Kepolisian setempat."
                )
            )
        ),
        Persyaratan(
            22,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertipikat asli."
                )
            )
        ),
        Persyaratan(
            23,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertipikat asli."
                )
            )
        ),
        Persyaratan(
            24,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Sertipikat Hak Atas Tanah yang merupakan tanah bersama (asli)."
                ),
                Item(
                    "5.",
                    "Proposal pembangunan rumah susun."
                ),
                Item(
                    "6.",
                    "Ijin layak huni."
                ),
                Item(
                    "7.",
                    "Advis Planning."
                ),
                Item(
                    "8.",
                    "Akta pemisahan yang dibuat oleh penyelenggara pembangunan rumah susun, dengan lampiran gambar dan uraian pertelaan dalam arah vertikal maupun horisontal serta nilai perbandingan proposionalnya yang disahkan oleh pejabat yang berwenang (Gubernur untuk DKI Jakarta atau Bupati/Walikota)."
                )
            )
        ),
        Persyaratan(
            25,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Sertipikat asli HGB (ada di Kantor Pertanahan yang bersangkutan)."
                ),
                Item(
                    "5.",
                    "Fotokopi SPPT PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket."
                )
            )
        ),
        Persyaratan(
            26,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon/Nadzir dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Akta Ikrar Wakaf."
                ),
                Item(
                    "5.",
                    "Sertipikat asli."
                ),
                Item(
                    "6.",
                    "Surat Pengesahan Nadzir."
                ),
                Item(
                    "7.",
                    "Fotokopi identitas Wakif yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "8.",
                    "Pernyataan tenggang waktu wakaf."
                ),
                Item(
                    "9.",
                    "Melampirkan bukti SSP/PPh sesuai dengan ketentuan."
                )
            )
        ),
        Persyaratan(
            27,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Surat Persetujuan dari kreditor (jika dibebani hak tanggungan)."
                ),
                Item(
                    "5.",
                    "Fotokopi SPPT PBB Tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "6.",
                    "Penyerahan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                ),
                Item(
                    "7.",
                    "Sertipikat HM/HGB/HP."
                ),
                Item(
                    "8.",
                    "IMB/surat keterangan Kepala Desa/Lurah bagi perubahan hak dari HGB/HP menjadi HM untuk rumah tinggal dengan luas sampai dengan 600 m2."
                )
            )
        ),
        Persyaratan(
            28,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Fotokopi Sertipikat yang telah dicocokkan dengan aslinya oleh petugas loket."
                )
            )
        ),
        Persyaratan(
            29,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                )
            )
        ),
        Persyaratan(
            30,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon/pemegang dan penerima hak (KTP, KK) serta kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Asli Bukti perolehan tanah/Alas Hak."
                ),
                Item(
                    "5.",
                    "Asli Surat-surat bukti pelepasan hak dan pelunasan tanah dan rumah (Rumah Gol III) atau rumah yang dibeli dari pemerintah."
                ),
                Item(
                    "6.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                )
            )
        ),
        Persyaratan(
            31,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas (KTP) pemohon dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi Akta Pendirian dan Pengesahan Badan Hukum yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "5.",
                    "Bukti perolehan tanah/Alas Hak."
                ),
                Item(
                    "6.",
                    "Asli Surat-surat bukti pelepasan hak dan pelunasan tanah dan rumah (Rumah Gol III) atau rumah yang dibeli dari pemerintah."
                ),
                Item(
                    "7.",
                    "SK Penunjukan badan hukum yang dapat memperoleh Hak Milik dari Kepala Badan Pertanahan Nasional."
                ),
                Item(
                    "8.",
                    "Surat ijin untuk memperoleh Hak Milik dari Kepala Badan Pertanahan Nasional."
                ),
                Item(
                    "9.",
                    "Fotokopi SPPT PBB Tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "10.",
                    "Melampirkan bukti SSP/PPh sesuai dengan ketentuan."
                )
            )
        ),
        Persyaratan(
            32,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Bukti perolehan tanah/Alas Hak."
                ),
                Item(
                    "5.",
                    "Proposal rencana penggunaan dan pemanfaatan tanah."
                ),
                Item(
                    "6.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                )
            )
        ),
        Persyaratan(
            33,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya di atas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon/pemegang dan penerima hak (KTP, KK) serta kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi Tanda Daftar Perusahaan, Akta Pendirian, Pengesahan Badan Hukum dan bukti pengumuman dalam Lembaran Negara yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "5.",
                    "Ijin Lokasi atau Surat Ijin Penunjukan Penggunaan Tanah."
                ),
                Item(
                    "6.",
                    "Bukti perolehan tanah/Alas Hak dari pemilik/penggarap tanah atau pemegang aset tanah/sk pelepasan kawasan hutan."
                ),
                Item(
                    "7.",
                    "Proposal/Rencana Pengusahaan Tanah jangka pendek dan jangka panjang."
                ),
                Item(
                    "8.",
                    "Ijin usaha dari instansi teknis."
                ),
                Item(
                    "9.",
                    "Fotokopi SPPT PBB Tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                )
            )
        ),
        Persyaratan(
            34,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon/pemegang dan penerima hak (KTP, KK) serta kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Bukti perolehan tanah/Alas Hak."
                ),
                Item(
                    "5.",
                    "Fotokopi SPPT PBB Tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                ),
                Item(
                    "6.",
                    "Melampirkan bukti SSP/PPh sesuai dengan ketentuan."
                )
            )
        ),
        Persyaratan(
            35,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon/pemegang dan penerima hak (KTP, KK) serta kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi Tanda Daftar Perusahaan, Akta Pendirian, Pengesahan Badan Hukum dan bukti pengumuman dalam Lembaran Negara yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "5.",
                    "Ijin Lokasi atau Surat Ijin Penunjukan Penggunaan Tanah."
                ),
                Item(
                    "6.",
                    "Bukti perolehan tanah/Alas Hak dari pemilik/penggarap tanah atau pemegang aset tanah/sk pelepasan kawasan hutan."
                ),
                Item(
                    "7.",
                    "Proposal/Rencana Pengusahaan Tanah jangka pendek dan jangka panjang."
                ),
                Item(
                    "8.",
                    "Ijin usaha dari instansi teknis."
                ),
                Item(
                    "9.",
                    "Fotokopi SPPT PBB Tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                )
            )
        ),
        Persyaratan(
            36,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon/pemegang dan penerima hak (KTP, KK) serta kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Bukti perolehan tanah/Alas Hak."
                ),
                Item(
                    "5.",
                    "Surat pernyataan pemohon mengenai jumlah bidang dan status tanah-tanah yang telah dimiliki."
                ),
                Item(
                    "6.",
                    "Fotokopi SPPT PBB Tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                ),
                Item(
                    "7.",
                    "Melampirkan bukti SSP/PPh sesuai dengan ketentuan."
                )
            )
        ),
        Persyaratan(
            37,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Fotokopi identitas pemohon dan kuasa apabila dikuasakan, Surat Ijin Tinggal Tetap/Kartu Ijin Menetap (KIM) yang dikeluarkan oleh Kantor Imigrasi, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "3.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "4.",
                    "Bukti perolehan tanah/Alas Hak."
                ),
                Item(
                    "5.",
                    "Fotokopi SPPT PBB Tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                ),
                Item(
                    "6.",
                    "Melampirkan bukti SSP/PPh sesuai dengan ketentuan."
                )
            )
        ),
        Persyaratan(
            38,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas (KTP) pemohon dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi Tanda Daftar Perusahaan, Akta Pendirian dan Pengesahan Badan Hukum yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "5.",
                    "Ijin Lokasi atau Surat Ijin Penunjukan Penggunaan Tanah."
                ),
                Item(
                    "6.",
                    "Bukti perolehan tanah/Alas Hak."
                ),
                Item(
                    "7.",
                    "Proposal/Rencana Pengusahaan Tanah."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                ),
                Item(
                    "9.",
                    "Melampirkan bukti SSP/PPh sesuai dengan ketentuan."
                )
            )
        ),
        Persyaratan(
            39,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon dan kuasa apabila dikuasakan, Surat Ijin Tinggal Tetap/Kartu Ijin Menetap (KIM) yang dikeluarkan oleh Kantor Imigrasi, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Surat Keterangan Berkedudukan di Indonesia."
                ),
                Item(
                    "5.",
                    "Ijin Lokasi atau Surat Ijin Penunjukan Penggunaan Tanah."
                ),
                Item(
                    "6.",
                    "Fotokopi Akte Pendirian Badan Hukum dari Notaris dan Pengesahan Badan Hukum yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "7.",
                    "Bukti perolehan tanah/Alas Hak."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                ),
                Item(
                    "9.",
                    "Melampirkan bukti SSP/PPh sesuai dengan ketentuan."
                )
            )
        ),
        Persyaratan(
            40,
            listOf()
        ),
        Persyaratan(
            41,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Surat Rekomendasi dari Departemen Luar Negeri."
                ),
                Item(
                    "5.",
                    "Bukti perolehan tanah/Alas Hak."
                ),
                Item(
                    "6.",
                    "Fotokopi SPPT PBB Tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "7.",
                    "Melampirkan bukti SSP/PPh sesuai dengan ketentuan."
                )
            )
        ),
        Persyaratan(
            42,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "SK Pencadangan Tanah dari Gubernur/Bupati/Walikota (untuk program transmigrasi)."
                ),
                Item(
                    "5.",
                    "Surat Persetujuan Penetapan Lokasi/Surat Ijin Penunjukan Penggunaan Tanah (untuk instansi Pemerintah) atau Ijin Lokasi untuk BUMN, BUMD dalam rangka penanaman modal."
                ),
                Item(
                    "6.",
                    "Proposal penggunaan tanah jangka panjang dan jangka pendek."
                ),
                Item(
                    "7.",
                    "Bukti perolehan tanah/Alas Hak surat pernyataan dari pengelola aset."
                ),
                Item(
                    "8.",
                    "Surat Pelepasan Kawasan Hutan dari Departemen Kehutanan apabila tanah yang dimohon kawasan hutan."
                ),
                Item(
                    "9.",
                    "Penyerahan bukti SSB (BPHTB)/khusus BUMN/BUMD, bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                ),
                Item(
                    "10.",
                    "Melampirkan bukti SSP/PPh sesuai dengan ketentuan."
                )
            )
        ),
        Persyaratan(
            43,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon/pemegang dan penerima hak (KTP, KK) serta kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Bukti alas hak/garapan."
                ),
                Item(
                    "5.",
                    "Akta Ikrar Wakaf/Surat Ikrar Wakaf."
                ),
                Item(
                    "6.",
                    "Fotokopi SPPT PBB Tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "7.",
                    "Pertimbangan Teknis Pertanahan."
                ),
                Item(
                    "8.",
                    "Melampirkan bukti SSP/PPh sesuai dengan ketentuan."
                )
            )
        ),
        Persyaratan(
            44,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Fotokopi KTP dan para pihak penjual-pembeli dan / atau kuasanya."
                ),
                Item(
                    "7.",
                    "Ijin pemindahan hak apabila di dalam sertifikat / keputusannya dicantumkan tanda yang menyatakan bahwa hak tersebut hanya boleh dipindahtangankan jika telah diperoleh ijin dari instansi yang berwenang."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                )
            )
        ),
        Persyaratan(
            45,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Fotokopi KTP dan para pihak penjual-pembeli dan/atau kuasanya."
                ),
                Item(
                    "7.",
                    "Ijin pemindahan hak apabila di dalam sertifikat/keputusannya dicantumkan tanda yang menyatakan bahwa hak tersebut hanya boleh dipindahtangankan jika telah diperoleh ijin dari instansi yang berwenang."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                )
            )
        ),
        Persyaratan(
            46,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Fotokopi KTP dan para pihak penjual-pembeli dan/atau kuasanya."
                ),
                Item(
                    "7.",
                    "Ijin pemindahan hak apabila di dalam sertifikat / keputusannya dicantumkan tanda yang menyatakan bahwa hak tersebut hanya boleh dipindahtangankan jika telah diperoleh ijin dari instansi yang berwenang."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                )
            )
        ),
        Persyaratan(
            47,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Fotokopi KTP dan para pihak penjual-pembeli dan/atau kuasanya."
                ),
                Item(
                    "7.",
                    "Ijin pemindahan hak apabila di dalam sertifikat/keputusannya dicantumkan tanda yang menyatakan bahwa hak tersebut hanya boleh dipindahtangankan jika telah diperoleh ijin dari instansi yang berwenang."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                )
            )
        ),
        Persyaratan(
            48,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Fotokopi KTP dan para pihak penjual-pembeli dan / atau kuasanya."
                ),
                Item(
                    "7.",
                    "Ijin pemindahan hak apabila di dalam sertifikat / keputusannya dicantumkan tanda yang menyatakan bahwa hak tersebut hanya boleh dipindahtangankan jika telah diperoleh ijin dari instansi yang berwenang."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                )
            )
        ),
        Persyaratan(
            49,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Fotokopi KTP dan para pihak penjual-pembeli dan/atau kuasanya."
                ),
                Item(
                    "7.",
                    "Ijin pemindahan hak apabila di dalam sertifikat / keputusannya dicantumkan tanda yang menyatakan bahwa hak tersebut hanya boleh dipindahtangankan jika telah diperoleh ijin dari instansi yang berwenang."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                )
            )
        ),
        Persyaratan(
            50,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Fotokopi KTP dan para pihak penjual-pembeli dan/atau kuasanya."
                ),
                Item(
                    "7.",
                    "Ijin pemindahan hak apabila di dalam sertifikat/keputusannya dicantumkan tanda yang menyatakan bahwa hak tersebut hanya boleh dipindahtangankan jika telah diperoleh ijin dari instansi yang berwenang."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                )
            )
        ),
        Persyaratan(
            51,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Fotokopi KTP dan para pihak penjual-pembeli dan/atau kuasanya."
                ),
                Item(
                    "7.",
                    "Ijin pemindahan hak apabila di dalam sertifikat/keputusannya dicantumkan tanda yang menyatakan bahwa hak tersebut hanya boleh dipindahtangankan jika telah diperoleh ijin dari instansi yang berwenang."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                )
            )
        ),
        Persyaratan(
            52,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Fotokopi KTP dan para pihak penjual-pembeli dan/atau kuasanya."
                ),
                Item(
                    "7.",
                    "Ijin pemindahan hak apabila di dalam sertifikat/keputusannya dicantumkan tanda yang menyatakan bahwa hak tersebut hanya boleh dipindahtangankan jika telah diperoleh ijin dari instansi yang berwenang."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                )
            )
        ),
        Persyaratan(
            53,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Fotokopi KTP dan para pihak penjual-pembeli dan/atau kuasanya."
                ),
                Item(
                    "7.",
                    "Ijin pemindahan hak apabila di dalam sertifikat/keputusannya dicantumkan tanda yang menyatakan bahwa hak tersebut hanya boleh dipindahtangankan jika telah diperoleh ijin dari instansi yang berwenang."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                )
            )
        ),
        Persyaratan(
            54,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Fotokopi KTP dan para pihak penjual-pembeli dan/atau kuasanya."
                ),
                Item(
                    "7.",
                    "Ijin pemindahan hak apabila di dalam sertifikat/keputusannya dicantumkan tanda yang menyatakan bahwa hak tersebut hanya boleh dipindahtangankan jika telah diperoleh ijin dari instansi yang berwenang."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                )
            )
        ),
        Persyaratan(
            55,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Fotokopi KTP dan para pihak penjual-pembeli dan/atau kuasanya."
                ),
                Item(
                    "7.",
                    "Ijin pemindahan hak apabila di dalam sertifikat/keputusannya dicantumkan tanda yang menyatakan bahwa hak tersebut hanya boleh dipindahtangankan jika telah diperoleh ijin dari instansi yang berwenang."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                )
            )
        ),
        Persyaratan(
            56,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi akta pendirian dan pengesahan badan hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Sertifikat Asli."
                ),
                Item(
                    "6.",
                    "Fotokopi KTP dan para pihak penjual-pembeli dan/atau kuasanya."
                ),
                Item(
                    "7.",
                    "Ijin pemindahan hak apabila di dalam sertifikat/keputusannya dicantumkan tanda yang menyatakan bahwa hak tersebut hanya boleh dipindahtangankan jika telah diperoleh ijin dari instansi yang berwenang."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket, penyerahan bukti SSB (BPHTB) dan bukti bayar uang pemasukan (pada saat pendaftaran hak)."
                )
            )
        ),
        Persyaratan(
            57,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi NPWP, Akta Pendirian dan Pengesahan Badan Hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Proposal rencana kegiatan teknis."
                ),
                Item(
                    "6.",
                    "Sket lokasi yang dimohon."
                ),
                Item(
                    "7.",
                    "Fotokopi dasar penguasaan tanah."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket."
                )
            )
        ),
        Persyaratan(
            58,
            listOf(
                Item(
                    "1.",
                    "Formulir permohonan yang sudah diisi dan ditandatangani pemohon atau kuasanya diatas materai cukup."
                ),
                Item(
                    "2.",
                    "Surat kuasa apabila dikuasakan."
                ),
                Item(
                    "3.",
                    "Fotokopi identitas pemohon (KTP,KK) dan kuasa apabila dikuasakan, yang telah dicocokkan dengan aslinya oleh petugas loket."
                ),
                Item(
                    "4.",
                    "Fotokopi NPWP, Akta Pendirian dan Pengesahan Badan Hukum yang telah dicocokkan dengan aslinya oleh petugas loket, bagi badan hukum."
                ),
                Item(
                    "5.",
                    "Proposal rencana kegiatan teknis."
                ),
                Item(
                    "6.",
                    "Sket lokasi yang dimohon."
                ),
                Item(
                    "7.",
                    "Fotokopi dasar penguasaan tanah."
                ),
                Item(
                    "8.",
                    "Fotokopi SPPT dan PBB tahun berjalan yang telah dicocokkan dengan aslinya oleh petugas loket."
                )
            )
        )
    )
}